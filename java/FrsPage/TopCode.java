package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes16.dex */
public final class TopCode extends Message {
    public static final String DEFAULT_CODE_LINK = "";
    public static final String DEFAULT_GAME_LINK = "";
    public static final Integer DEFAULT_GET_TYPE = 0;
    public static final Long DEFAULT_GIFTWORTH = 0L;
    public static final String DEFAULT_IMG_URL = "";
    public static final String DEFAULT_SUBTITLE = "";
    public static final String DEFAULT_SUMMARY = "";
    public static final String DEFAULT_SURPLUSGIFT = "";
    public static final String DEFAULT_TYPE_TEXT = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String code_link;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String game_link;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer get_type;
    @ProtoField(tag = 7, type = Message.Datatype.INT64)
    public final Long giftworth;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String img_url;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String subtitle;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String summary;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String surplusgift;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String type_text;

    private TopCode(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.img_url == null) {
                this.img_url = "";
            } else {
                this.img_url = builder.img_url;
            }
            if (builder.game_link == null) {
                this.game_link = "";
            } else {
                this.game_link = builder.game_link;
            }
            if (builder.summary == null) {
                this.summary = "";
            } else {
                this.summary = builder.summary;
            }
            if (builder.code_link == null) {
                this.code_link = "";
            } else {
                this.code_link = builder.code_link;
            }
            if (builder.get_type == null) {
                this.get_type = DEFAULT_GET_TYPE;
            } else {
                this.get_type = builder.get_type;
            }
            if (builder.surplusgift == null) {
                this.surplusgift = "";
            } else {
                this.surplusgift = builder.surplusgift;
            }
            if (builder.giftworth == null) {
                this.giftworth = DEFAULT_GIFTWORTH;
            } else {
                this.giftworth = builder.giftworth;
            }
            if (builder.type_text == null) {
                this.type_text = "";
            } else {
                this.type_text = builder.type_text;
            }
            if (builder.subtitle == null) {
                this.subtitle = "";
                return;
            } else {
                this.subtitle = builder.subtitle;
                return;
            }
        }
        this.img_url = builder.img_url;
        this.game_link = builder.game_link;
        this.summary = builder.summary;
        this.code_link = builder.code_link;
        this.get_type = builder.get_type;
        this.surplusgift = builder.surplusgift;
        this.giftworth = builder.giftworth;
        this.type_text = builder.type_text;
        this.subtitle = builder.subtitle;
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<TopCode> {
        public String code_link;
        public String game_link;
        public Integer get_type;
        public Long giftworth;
        public String img_url;
        public String subtitle;
        public String summary;
        public String surplusgift;
        public String type_text;

        public Builder() {
        }

        public Builder(TopCode topCode) {
            super(topCode);
            if (topCode != null) {
                this.img_url = topCode.img_url;
                this.game_link = topCode.game_link;
                this.summary = topCode.summary;
                this.code_link = topCode.code_link;
                this.get_type = topCode.get_type;
                this.surplusgift = topCode.surplusgift;
                this.giftworth = topCode.giftworth;
                this.type_text = topCode.type_text;
                this.subtitle = topCode.subtitle;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TopCode build(boolean z) {
            return new TopCode(this, z);
        }
    }
}
