package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class SpritePBGuide extends Message {
    public static final String DEFAULT_BUTTON_TEXT = "";
    public static final String DEFAULT_GUIDE_TEXT = "";
    public static final Long DEFAULT_GUIDE_TYPE = 0L;
    public static final String DEFAULT_JUMP_URL = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String button_text;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String guide_text;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long guide_type;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String jump_url;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<SpritePBGuide> {
        public String button_text;
        public String guide_text;
        public Long guide_type;
        public String jump_url;

        public Builder() {
        }

        public Builder(SpritePBGuide spritePBGuide) {
            super(spritePBGuide);
            if (spritePBGuide == null) {
                return;
            }
            this.guide_type = spritePBGuide.guide_type;
            this.guide_text = spritePBGuide.guide_text;
            this.button_text = spritePBGuide.button_text;
            this.jump_url = spritePBGuide.jump_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SpritePBGuide build(boolean z) {
            return new SpritePBGuide(this, z);
        }
    }

    public SpritePBGuide(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.guide_type;
            if (l == null) {
                this.guide_type = DEFAULT_GUIDE_TYPE;
            } else {
                this.guide_type = l;
            }
            String str = builder.guide_text;
            if (str == null) {
                this.guide_text = "";
            } else {
                this.guide_text = str;
            }
            String str2 = builder.button_text;
            if (str2 == null) {
                this.button_text = "";
            } else {
                this.button_text = str2;
            }
            String str3 = builder.jump_url;
            if (str3 == null) {
                this.jump_url = "";
                return;
            } else {
                this.jump_url = str3;
                return;
            }
        }
        this.guide_type = builder.guide_type;
        this.guide_text = builder.guide_text;
        this.button_text = builder.button_text;
        this.jump_url = builder.jump_url;
    }
}
