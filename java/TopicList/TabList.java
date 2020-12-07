package tbclient.TopicList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes21.dex */
public final class TabList extends Message {
    public static final String DEFAULT_SHARE_DESC = "";
    public static final String DEFAULT_SHARE_PIC = "";
    public static final String DEFAULT_SHARE_TITLE = "";
    public static final String DEFAULT_SHARE_URL = "";
    public static final String DEFAULT_TAB_NAME = "";
    public static final String DEFAULT_TAB_TYPE = "";
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String share_desc;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String share_pic;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String share_title;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String share_url;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String tab_name;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String tab_type;

    private TabList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.tab_name == null) {
                this.tab_name = "";
            } else {
                this.tab_name = builder.tab_name;
            }
            if (builder.tab_type == null) {
                this.tab_type = "";
            } else {
                this.tab_type = builder.tab_type;
            }
            if (builder.share_pic == null) {
                this.share_pic = "";
            } else {
                this.share_pic = builder.share_pic;
            }
            if (builder.share_title == null) {
                this.share_title = "";
            } else {
                this.share_title = builder.share_title;
            }
            if (builder.share_desc == null) {
                this.share_desc = "";
            } else {
                this.share_desc = builder.share_desc;
            }
            if (builder.share_url == null) {
                this.share_url = "";
                return;
            } else {
                this.share_url = builder.share_url;
                return;
            }
        }
        this.tab_name = builder.tab_name;
        this.tab_type = builder.tab_type;
        this.share_pic = builder.share_pic;
        this.share_title = builder.share_title;
        this.share_desc = builder.share_desc;
        this.share_url = builder.share_url;
    }

    /* loaded from: classes21.dex */
    public static final class Builder extends Message.Builder<TabList> {
        public String share_desc;
        public String share_pic;
        public String share_title;
        public String share_url;
        public String tab_name;
        public String tab_type;

        public Builder() {
        }

        public Builder(TabList tabList) {
            super(tabList);
            if (tabList != null) {
                this.tab_name = tabList.tab_name;
                this.tab_type = tabList.tab_type;
                this.share_pic = tabList.share_pic;
                this.share_title = tabList.share_title;
                this.share_desc = tabList.share_desc;
                this.share_url = tabList.share_url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TabList build(boolean z) {
            return new TabList(this, z);
        }
    }
}
