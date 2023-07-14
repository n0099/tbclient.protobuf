package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class SpriteBubble extends Message {
    public static final String DEFAULT_SEND_TEXT = "";
    public static final String DEFAULT_SPRITE_TEXT = "";
    public static final String DEFAULT_TEXT = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_VERSION = "";
    @ProtoField(tag = 10)
    public final SpriteButton button_info;
    @ProtoField(tag = 12, type = Message.Datatype.INT32)
    public final Integer disappear_seconds;
    @ProtoField(tag = 8)
    public final ThemeColorInfo icon_url;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer need_send;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer scene;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String send_text;
    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer speech_type;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String sprite_text;
    @ProtoField(tag = 6)
    public final PbContent struct_data;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String text;
    @ProtoField(tag = 7)
    public final ThemeColorInfo text_color;
    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String version;
    public static final Integer DEFAULT_SCENE = 0;
    public static final Integer DEFAULT_NEED_SEND = 0;
    public static final Integer DEFAULT_SPEECH_TYPE = 0;
    public static final Integer DEFAULT_DISAPPEAR_SECONDS = 0;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<SpriteBubble> {
        public SpriteButton button_info;
        public Integer disappear_seconds;
        public ThemeColorInfo icon_url;
        public Integer need_send;
        public Integer scene;
        public String send_text;
        public Integer speech_type;
        public String sprite_text;
        public PbContent struct_data;
        public String text;
        public ThemeColorInfo text_color;
        public String title;
        public String version;

        public Builder() {
        }

        public Builder(SpriteBubble spriteBubble) {
            super(spriteBubble);
            if (spriteBubble == null) {
                return;
            }
            this.scene = spriteBubble.scene;
            this.text = spriteBubble.text;
            this.need_send = spriteBubble.need_send;
            this.send_text = spriteBubble.send_text;
            this.version = spriteBubble.version;
            this.struct_data = spriteBubble.struct_data;
            this.text_color = spriteBubble.text_color;
            this.icon_url = spriteBubble.icon_url;
            this.sprite_text = spriteBubble.sprite_text;
            this.button_info = spriteBubble.button_info;
            this.speech_type = spriteBubble.speech_type;
            this.disappear_seconds = spriteBubble.disappear_seconds;
            this.title = spriteBubble.title;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SpriteBubble build(boolean z) {
            return new SpriteBubble(this, z);
        }
    }

    public SpriteBubble(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.scene;
            if (num == null) {
                this.scene = DEFAULT_SCENE;
            } else {
                this.scene = num;
            }
            String str = builder.text;
            if (str == null) {
                this.text = "";
            } else {
                this.text = str;
            }
            Integer num2 = builder.need_send;
            if (num2 == null) {
                this.need_send = DEFAULT_NEED_SEND;
            } else {
                this.need_send = num2;
            }
            String str2 = builder.send_text;
            if (str2 == null) {
                this.send_text = "";
            } else {
                this.send_text = str2;
            }
            String str3 = builder.version;
            if (str3 == null) {
                this.version = "";
            } else {
                this.version = str3;
            }
            this.struct_data = builder.struct_data;
            this.text_color = builder.text_color;
            this.icon_url = builder.icon_url;
            String str4 = builder.sprite_text;
            if (str4 == null) {
                this.sprite_text = "";
            } else {
                this.sprite_text = str4;
            }
            this.button_info = builder.button_info;
            Integer num3 = builder.speech_type;
            if (num3 == null) {
                this.speech_type = DEFAULT_SPEECH_TYPE;
            } else {
                this.speech_type = num3;
            }
            Integer num4 = builder.disappear_seconds;
            if (num4 == null) {
                this.disappear_seconds = DEFAULT_DISAPPEAR_SECONDS;
            } else {
                this.disappear_seconds = num4;
            }
            String str5 = builder.title;
            if (str5 == null) {
                this.title = "";
                return;
            } else {
                this.title = str5;
                return;
            }
        }
        this.scene = builder.scene;
        this.text = builder.text;
        this.need_send = builder.need_send;
        this.send_text = builder.send_text;
        this.version = builder.version;
        this.struct_data = builder.struct_data;
        this.text_color = builder.text_color;
        this.icon_url = builder.icon_url;
        this.sprite_text = builder.sprite_text;
        this.button_info = builder.button_info;
        this.speech_type = builder.speech_type;
        this.disappear_seconds = builder.disappear_seconds;
        this.title = builder.title;
    }
}
