<!-- 1. disable and enable -->

$(e).attr("disabled", true);
$(e).removeAttr("disabled");


<!-- 2. bootstrap table examples-->
<table id="qry-table">
</table>

<script type="text/javascript">
    var $table = $('#qry-table');

    // table 的查询参数
    var buildQueryParam = function (params) {
        var allParam = {
            uid: $("#inputUid").val(),
            pageNum: (params.offset / params.limit) + 1,
            pageSize: params.limit
        };
        return allParam;
    };

    function initTable() {
        //初始化查询table
        $table.bootstrapTable({
            url: '/path/to/url',
            method: 'post',
            striped: true,
            dataType: "json",
            contentType: "application/x-www-form-urlencoded",
            pageList: [10, 20, 50, 100],
            pageSize: 100,
            pageNumber: 1,
            pagination: true,
            sidePagination: "server",
            queryParams: buildQueryParam,
            responseHandler: function (res) {
                if (res.success) {
                    return {
                        rows: res.result,
                        total: res.total
                    };
                } else {
                    alert(res.error);
                    return {
                        rows: {},
                        total: 0
                    }
                }
            },
            columns: [
                {
                    field: 'platform',
                    title: '平台',
                    align: 'center',
                    width: '8%',
                    formatter: platformFormatter
                },
                {
                    field: 'sign',
                    title: '标识',
                    align: 'left',
                    width: '35%'
                },
                {
                    field: 'operate',
                    title: '操作',
                    align: 'center',
                    events: operEvents,
                    width: '6%',
                    formatter: operFormatter
                }]
        });
    }


    var operEvents = {
        'click #query': function (e, value, row, index) {
            console.info('');
        }
    };

    var operFormatter = function (value, row, index) {
        return [
            '<button id="query" class="btn btn-warning btn-xs m-l-sm" type="button">',
            'do something',
            '</button>'
        ].join('');
    };

    function platformFormatter(value, row, index) {
        var div = '<div class="">' + platform[value] + '</div>';
        return div;
    }


</script>
