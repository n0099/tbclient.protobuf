package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class MaskLayerText extends Message {
    public static final String DEFAULT_SCHEMA = "";
    public static final String DEFAULT_TEXT = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String schema;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String text;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<MaskLayerText> {
        public String schema;
        public String text;

        public Builder() {
        }

        public Builder(MaskLayerText maskLayerText) {
            super(maskLayerText);
            if (maskLayerText == null) {
                return;
            }
            this.text = maskLayerText.text;
            this.schema = maskLayerText.schema;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public MaskLayerText build(boolean z) {
            return new MaskLayerText(this, z);
        }
    }

    public MaskLayerText(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.text;
            if (str == null) {
                this.text = "";
            } else {
                this.text = str;
            }
            String str2 = builder.schema;
            if (str2 == null) {
                this.schema = "";
                return;
            } else {
                this.schema = str2;
                return;
            }
        }
        this.text = builder.text;
        this.schema = builder.schema;
    }
}
