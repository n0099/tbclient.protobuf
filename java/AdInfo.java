package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes10.dex */
public final class AdInfo extends Message {
    public static final String DEFAULT_AD_DESC = "";
    public static final String DEFAULT_AD_NAME = "";
    public static final String DEFAULT_AD_PIC = "";
    public static final String DEFAULT_AD_URL = "";
    public static final String DEFAULT_PORTRAIT = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String ad_desc;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String ad_name;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String ad_pic;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer ad_type;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String ad_url;
    @ProtoField(label = Message.Label.REPEATED, tag = 8)
    public final List<Media> media;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer show_rule;
    public static final Integer DEFAULT_SHOW_RULE = 0;
    public static final Integer DEFAULT_AD_TYPE = 0;
    public static final List<Media> DEFAULT_MEDIA = Collections.emptyList();

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<AdInfo> {
        public String ad_desc;
        public String ad_name;
        public String ad_pic;
        public Integer ad_type;
        public String ad_url;
        public List<Media> media;
        public String portrait;
        public Integer show_rule;

        public Builder() {
        }

        public Builder(AdInfo adInfo) {
            super(adInfo);
            if (adInfo == null) {
                return;
            }
            this.show_rule = adInfo.show_rule;
            this.ad_type = adInfo.ad_type;
            this.ad_desc = adInfo.ad_desc;
            this.ad_pic = adInfo.ad_pic;
            this.ad_url = adInfo.ad_url;
            this.ad_name = adInfo.ad_name;
            this.portrait = adInfo.portrait;
            this.media = Message.copyOf(adInfo.media);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AdInfo build(boolean z) {
            return new AdInfo(this, z);
        }
    }

    public AdInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.show_rule;
            if (num == null) {
                this.show_rule = DEFAULT_SHOW_RULE;
            } else {
                this.show_rule = num;
            }
            Integer num2 = builder.ad_type;
            if (num2 == null) {
                this.ad_type = DEFAULT_AD_TYPE;
            } else {
                this.ad_type = num2;
            }
            String str = builder.ad_desc;
            if (str == null) {
                this.ad_desc = "";
            } else {
                this.ad_desc = str;
            }
            String str2 = builder.ad_pic;
            if (str2 == null) {
                this.ad_pic = "";
            } else {
                this.ad_pic = str2;
            }
            String str3 = builder.ad_url;
            if (str3 == null) {
                this.ad_url = "";
            } else {
                this.ad_url = str3;
            }
            String str4 = builder.ad_name;
            if (str4 == null) {
                this.ad_name = "";
            } else {
                this.ad_name = str4;
            }
            String str5 = builder.portrait;
            if (str5 == null) {
                this.portrait = "";
            } else {
                this.portrait = str5;
            }
            List<Media> list = builder.media;
            if (list == null) {
                this.media = DEFAULT_MEDIA;
                return;
            } else {
                this.media = Message.immutableCopyOf(list);
                return;
            }
        }
        this.show_rule = builder.show_rule;
        this.ad_type = builder.ad_type;
        this.ad_desc = builder.ad_desc;
        this.ad_pic = builder.ad_pic;
        this.ad_url = builder.ad_url;
        this.ad_name = builder.ad_name;
        this.portrait = builder.portrait;
        this.media = Message.immutableCopyOf(builder.media);
    }
}
