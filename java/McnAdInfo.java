package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class McnAdInfo extends Message {
    public static final String DEFAULT_BUTTON_TITLE = "";
    public static final String DEFAULT_CARD_TITLE = "";
    public static final String DEFAULT_JUMP_URL = "";
    public static final String DEFAULT_PIC_URL = "";
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long ad_end_time;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long ad_start_time;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String button_title;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String card_title;
    @ProtoField(tag = 7, type = Message.Datatype.INT64)
    public final Long effect_time;
    @ProtoField(tag = 8, type = Message.Datatype.INT64)
    public final Long expire_time;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String jump_url;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String pic_url;
    public static final Long DEFAULT_AD_START_TIME = 0L;
    public static final Long DEFAULT_AD_END_TIME = 0L;
    public static final Long DEFAULT_EFFECT_TIME = 0L;
    public static final Long DEFAULT_EXPIRE_TIME = 0L;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<McnAdInfo> {
        public Long ad_end_time;
        public Long ad_start_time;
        public String button_title;
        public String card_title;
        public Long effect_time;
        public Long expire_time;
        public String jump_url;
        public String pic_url;

        public Builder() {
        }

        public Builder(McnAdInfo mcnAdInfo) {
            super(mcnAdInfo);
            if (mcnAdInfo == null) {
                return;
            }
            this.ad_start_time = mcnAdInfo.ad_start_time;
            this.ad_end_time = mcnAdInfo.ad_end_time;
            this.pic_url = mcnAdInfo.pic_url;
            this.jump_url = mcnAdInfo.jump_url;
            this.card_title = mcnAdInfo.card_title;
            this.button_title = mcnAdInfo.button_title;
            this.effect_time = mcnAdInfo.effect_time;
            this.expire_time = mcnAdInfo.expire_time;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public McnAdInfo build(boolean z) {
            return new McnAdInfo(this, z);
        }
    }

    public McnAdInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.ad_start_time;
            if (l == null) {
                this.ad_start_time = DEFAULT_AD_START_TIME;
            } else {
                this.ad_start_time = l;
            }
            Long l2 = builder.ad_end_time;
            if (l2 == null) {
                this.ad_end_time = DEFAULT_AD_END_TIME;
            } else {
                this.ad_end_time = l2;
            }
            String str = builder.pic_url;
            if (str == null) {
                this.pic_url = "";
            } else {
                this.pic_url = str;
            }
            String str2 = builder.jump_url;
            if (str2 == null) {
                this.jump_url = "";
            } else {
                this.jump_url = str2;
            }
            String str3 = builder.card_title;
            if (str3 == null) {
                this.card_title = "";
            } else {
                this.card_title = str3;
            }
            String str4 = builder.button_title;
            if (str4 == null) {
                this.button_title = "";
            } else {
                this.button_title = str4;
            }
            Long l3 = builder.effect_time;
            if (l3 == null) {
                this.effect_time = DEFAULT_EFFECT_TIME;
            } else {
                this.effect_time = l3;
            }
            Long l4 = builder.expire_time;
            if (l4 == null) {
                this.expire_time = DEFAULT_EXPIRE_TIME;
                return;
            } else {
                this.expire_time = l4;
                return;
            }
        }
        this.ad_start_time = builder.ad_start_time;
        this.ad_end_time = builder.ad_end_time;
        this.pic_url = builder.pic_url;
        this.jump_url = builder.jump_url;
        this.card_title = builder.card_title;
        this.button_title = builder.button_title;
        this.effect_time = builder.effect_time;
        this.expire_time = builder.expire_time;
    }
}
