
$(function () {
    App.setbasePath("../");
    addTabs({
        id: '10008',
        title: '欢迎页',
        close: false,
        url: 'welcome',
        urlType: "relative"
    });

    App.fixIframeCotent();
    var menus = [
        {
            id: "9001",
            text: "UI Elements",
            icon: "fa fa-laptop",
            children: [
                {
                    id: "90011",
                    text: "test1",
                    icon: "fa fa-circle-o",
                    url: "test1",
                    targetType: "iframe-tab"
                },
                {
                    id: "90012",
                    text: "test2",
                    url: "test2",
                    targetType: "iframe-tab",
                    icon: "fa fa-circle-o"
                },
                {
                    id: "90013",
                    text: "test3",
                    url: "test3",
                    targetType: "iframe-tab",
                    icon: "fa fa-circle-o"
                }
            ]
        },
        {
            id: "9002",
            text: "Forms",
            icon: "fa fa-edit",
            children: [
                {
                    id: "90021",
                    text: "test4",
                    url: "test4",
                    targetType: "iframe-tab",
                    icon: "fa fa-circle-o"
                }
            ]
        }
    ];
    $('.sidebar-menu').sidebarMenu({data: menus});
});