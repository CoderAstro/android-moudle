package com.sctx.app.android.recycleviewmodel.model;

import java.util.List;

public class ItemModel {


    /**
     * code : 0
     * data : [{"title":"标题4","content":"这里是二级文本。这里是二级文本。这里是二级文本。这里是二级文本。这里是二级文本。这里是二级文本。","url":"https://images.sctx.com/upload/shop/store/goods/2354/2354_05598525066783227.jpg"}]
     */

    private int code;
    private List<DataBean> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * title : 标题4
         * content : 这里是二级文本。这里是二级文本。这里是二级文本。这里是二级文本。这里是二级文本。这里是二级文本。
         * url : https://images.sctx.com/upload/shop/store/goods/2354/2354_05598525066783227.jpg
         */

        private String title;
        private String content;
        private String url;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
