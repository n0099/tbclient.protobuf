package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class PbLinkInfo extends Message {
    public static final String DEFAULT_CONTENT1 = "";
    public static final String DEFAULT_CONTENT2 = "";
    public static final String DEFAULT_EXT_TXT = "";
    public static final String DEFAULT_LINK_FROM = "";
    public static final String DEFAULT_PIC_URL = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_TO_URL = "";
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String content1;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String content2;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String ext_txt;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String link_from;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String pic_url;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer sort;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String to_url;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer url_type;
    public static final Integer DEFAULT_SORT = 0;
    public static final Integer DEFAULT_URL_TYPE = 0;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<PbLinkInfo> {
        public String content1;
        public String content2;
        public String ext_txt;
        public String link_from;
        public String pic_url;
        public Integer sort;
        public String title;
        public String to_url;
        public Integer url_type;

        public Builder() {
        }

        public Builder(PbLinkInfo pbLinkInfo) {
            super(pbLinkInfo);
            if (pbLinkInfo == null) {
                return;
            }
            this.title = pbLinkInfo.title;
            this.to_url = pbLinkInfo.to_url;
            this.pic_url = pbLinkInfo.pic_url;
            this.link_from = pbLinkInfo.link_from;
            this.ext_txt = pbLinkInfo.ext_txt;
            this.sort = pbLinkInfo.sort;
            this.url_type = pbLinkInfo.url_type;
            this.content1 = pbLinkInfo.content1;
            this.content2 = pbLinkInfo.content2;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PbLinkInfo build(boolean z) {
            return new PbLinkInfo(this, z);
        }
    }

    public PbLinkInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.to_url;
            if (str2 == null) {
                this.to_url = "";
            } else {
                this.to_url = str2;
            }
            String str3 = builder.pic_url;
            if (str3 == null) {
                this.pic_url = "";
            } else {
                this.pic_url = str3;
            }
            String str4 = builder.link_from;
            if (str4 == null) {
                this.link_from = "";
            } else {
                this.link_from = str4;
            }
            String str5 = builder.ext_txt;
            if (str5 == null) {
                this.ext_txt = "";
            } else {
                this.ext_txt = str5;
            }
            Integer num = builder.sort;
            if (num == null) {
                this.sort = DEFAULT_SORT;
            } else {
                this.sort = num;
            }
            Integer num2 = builder.url_type;
            if (num2 == null) {
                this.url_type = DEFAULT_URL_TYPE;
            } else {
                this.url_type = num2;
            }
            String str6 = builder.content1;
            if (str6 == null) {
                this.content1 = "";
            } else {
                this.content1 = str6;
            }
            String str7 = builder.content2;
            if (str7 == null) {
                this.content2 = "";
                return;
            } else {
                this.content2 = str7;
                return;
            }
        }
        this.title = builder.title;
        this.to_url = builder.to_url;
        this.pic_url = builder.pic_url;
        this.link_from = builder.link_from;
        this.ext_txt = builder.ext_txt;
        this.sort = builder.sort;
        this.url_type = builder.url_type;
        this.content1 = builder.content1;
        this.content2 = builder.content2;
    }
}
