package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes6.dex */
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

    private AdInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.show_rule == null) {
                this.show_rule = DEFAULT_SHOW_RULE;
            } else {
                this.show_rule = builder.show_rule;
            }
            if (builder.ad_type == null) {
                this.ad_type = DEFAULT_AD_TYPE;
            } else {
                this.ad_type = builder.ad_type;
            }
            if (builder.ad_desc == null) {
                this.ad_desc = "";
            } else {
                this.ad_desc = builder.ad_desc;
            }
            if (builder.ad_pic == null) {
                this.ad_pic = "";
            } else {
                this.ad_pic = builder.ad_pic;
            }
            if (builder.ad_url == null) {
                this.ad_url = "";
            } else {
                this.ad_url = builder.ad_url;
            }
            if (builder.ad_name == null) {
                this.ad_name = "";
            } else {
                this.ad_name = builder.ad_name;
            }
            if (builder.portrait == null) {
                this.portrait = "";
            } else {
                this.portrait = builder.portrait;
            }
            if (builder.media == null) {
                this.media = DEFAULT_MEDIA;
                return;
            } else {
                this.media = immutableCopyOf(builder.media);
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
        this.media = immutableCopyOf(builder.media);
    }

    /* loaded from: classes6.dex */
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
            if (adInfo != null) {
                this.show_rule = adInfo.show_rule;
                this.ad_type = adInfo.ad_type;
                this.ad_desc = adInfo.ad_desc;
                this.ad_pic = adInfo.ad_pic;
                this.ad_url = adInfo.ad_url;
                this.ad_name = adInfo.ad_name;
                this.portrait = adInfo.portrait;
                this.media = AdInfo.copyOf(adInfo.media);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AdInfo build(boolean z) {
            return new AdInfo(this, z);
        }
    }
}
