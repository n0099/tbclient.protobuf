package tbclient.TopicList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
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

    /* loaded from: classes2.dex */
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
            if (tabList == null) {
                return;
            }
            this.tab_name = tabList.tab_name;
            this.tab_type = tabList.tab_type;
            this.share_pic = tabList.share_pic;
            this.share_title = tabList.share_title;
            this.share_desc = tabList.share_desc;
            this.share_url = tabList.share_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TabList build(boolean z) {
            return new TabList(this, z);
        }
    }

    public TabList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.tab_name;
            if (str == null) {
                this.tab_name = "";
            } else {
                this.tab_name = str;
            }
            String str2 = builder.tab_type;
            if (str2 == null) {
                this.tab_type = "";
            } else {
                this.tab_type = str2;
            }
            String str3 = builder.share_pic;
            if (str3 == null) {
                this.share_pic = "";
            } else {
                this.share_pic = str3;
            }
            String str4 = builder.share_title;
            if (str4 == null) {
                this.share_title = "";
            } else {
                this.share_title = str4;
            }
            String str5 = builder.share_desc;
            if (str5 == null) {
                this.share_desc = "";
            } else {
                this.share_desc = str5;
            }
            String str6 = builder.share_url;
            if (str6 == null) {
                this.share_url = "";
                return;
            } else {
                this.share_url = str6;
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
}
