package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.TagLabelInfo;
/* loaded from: classes9.dex */
public final class LiveFuseForumData extends Message {
    public static final String DEFAULT_BJIMG_DARK_BIG = "";
    public static final String DEFAULT_BJIMG_DARK_SMALL = "";
    public static final String DEFAULT_BJIMG_LIGHT_BIG = "";
    public static final String DEFAULT_BJIMG_LIGHT_SMALL = "";
    public static final String DEFAULT_ICON_URL = "";
    public static final String DEFAULT_ONLINE_USERS = "";
    public static final String DEFAULT_SCHEMA = "";
    public static final String DEFAULT_YYEXT = "";
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String bjimg_dark_big;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String bjimg_dark_small;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String bjimg_light_big;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String bjimg_light_small;
    @ProtoField(label = Message.Label.REPEATED, tag = 2, type = Message.Datatype.STRING)
    public final List<String> head_img;
    @ProtoField(tag = 13, type = Message.Datatype.INT32)
    public final Integer head_img_style;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String icon_url;
    @ProtoField(label = Message.Label.REPEATED, tag = 14)
    public final List<TagLabelInfo> label_infos;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String online_users;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String schema;
    @ProtoField(label = Message.Label.REPEATED, tag = 3, type = Message.Datatype.STRING)
    public final List<String> title;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer type;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String yyext;
    public static final List<String> DEFAULT_HEAD_IMG = Collections.emptyList();
    public static final List<String> DEFAULT_TITLE = Collections.emptyList();
    public static final Integer DEFAULT_TYPE = 0;
    public static final Integer DEFAULT_HEAD_IMG_STYLE = 0;
    public static final List<TagLabelInfo> DEFAULT_LABEL_INFOS = Collections.emptyList();

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<LiveFuseForumData> {
        public String bjimg_dark_big;
        public String bjimg_dark_small;
        public String bjimg_light_big;
        public String bjimg_light_small;
        public List<String> head_img;
        public Integer head_img_style;
        public String icon_url;
        public List<TagLabelInfo> label_infos;
        public String online_users;
        public String schema;
        public List<String> title;
        public Integer type;
        public String yyext;

        public Builder() {
        }

        public Builder(LiveFuseForumData liveFuseForumData) {
            super(liveFuseForumData);
            if (liveFuseForumData == null) {
                return;
            }
            this.online_users = liveFuseForumData.online_users;
            this.head_img = Message.copyOf(liveFuseForumData.head_img);
            this.title = Message.copyOf(liveFuseForumData.title);
            this.schema = liveFuseForumData.schema;
            this.type = liveFuseForumData.type;
            this.yyext = liveFuseForumData.yyext;
            this.icon_url = liveFuseForumData.icon_url;
            this.bjimg_dark_big = liveFuseForumData.bjimg_dark_big;
            this.bjimg_light_big = liveFuseForumData.bjimg_light_big;
            this.bjimg_dark_small = liveFuseForumData.bjimg_dark_small;
            this.bjimg_light_small = liveFuseForumData.bjimg_light_small;
            this.head_img_style = liveFuseForumData.head_img_style;
            this.label_infos = Message.copyOf(liveFuseForumData.label_infos);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LiveFuseForumData build(boolean z) {
            return new LiveFuseForumData(this, z);
        }
    }

    public LiveFuseForumData(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.online_users;
            if (str == null) {
                this.online_users = "";
            } else {
                this.online_users = str;
            }
            List<String> list = builder.head_img;
            if (list == null) {
                this.head_img = DEFAULT_HEAD_IMG;
            } else {
                this.head_img = Message.immutableCopyOf(list);
            }
            List<String> list2 = builder.title;
            if (list2 == null) {
                this.title = DEFAULT_TITLE;
            } else {
                this.title = Message.immutableCopyOf(list2);
            }
            String str2 = builder.schema;
            if (str2 == null) {
                this.schema = "";
            } else {
                this.schema = str2;
            }
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            String str3 = builder.yyext;
            if (str3 == null) {
                this.yyext = "";
            } else {
                this.yyext = str3;
            }
            String str4 = builder.icon_url;
            if (str4 == null) {
                this.icon_url = "";
            } else {
                this.icon_url = str4;
            }
            String str5 = builder.bjimg_dark_big;
            if (str5 == null) {
                this.bjimg_dark_big = "";
            } else {
                this.bjimg_dark_big = str5;
            }
            String str6 = builder.bjimg_light_big;
            if (str6 == null) {
                this.bjimg_light_big = "";
            } else {
                this.bjimg_light_big = str6;
            }
            String str7 = builder.bjimg_dark_small;
            if (str7 == null) {
                this.bjimg_dark_small = "";
            } else {
                this.bjimg_dark_small = str7;
            }
            String str8 = builder.bjimg_light_small;
            if (str8 == null) {
                this.bjimg_light_small = "";
            } else {
                this.bjimg_light_small = str8;
            }
            Integer num2 = builder.head_img_style;
            if (num2 == null) {
                this.head_img_style = DEFAULT_HEAD_IMG_STYLE;
            } else {
                this.head_img_style = num2;
            }
            List<TagLabelInfo> list3 = builder.label_infos;
            if (list3 == null) {
                this.label_infos = DEFAULT_LABEL_INFOS;
                return;
            } else {
                this.label_infos = Message.immutableCopyOf(list3);
                return;
            }
        }
        this.online_users = builder.online_users;
        this.head_img = Message.immutableCopyOf(builder.head_img);
        this.title = Message.immutableCopyOf(builder.title);
        this.schema = builder.schema;
        this.type = builder.type;
        this.yyext = builder.yyext;
        this.icon_url = builder.icon_url;
        this.bjimg_dark_big = builder.bjimg_dark_big;
        this.bjimg_light_big = builder.bjimg_light_big;
        this.bjimg_dark_small = builder.bjimg_dark_small;
        this.bjimg_light_small = builder.bjimg_light_small;
        this.head_img_style = builder.head_img_style;
        this.label_infos = Message.immutableCopyOf(builder.label_infos);
    }
}
