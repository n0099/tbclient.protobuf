package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class FeedMaskLayer extends Message {
    public static final List<MaskLayerText> DEFAULT_BUTTON_TEXTS = Collections.emptyList();
    public static final String DEFAULT_TOPRIGHT_TEXT = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<MaskLayerText> button_texts;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String topright_text;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<FeedMaskLayer> {
        public List<MaskLayerText> button_texts;
        public String topright_text;

        public Builder() {
        }

        public Builder(FeedMaskLayer feedMaskLayer) {
            super(feedMaskLayer);
            if (feedMaskLayer == null) {
                return;
            }
            this.topright_text = feedMaskLayer.topright_text;
            this.button_texts = Message.copyOf(feedMaskLayer.button_texts);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FeedMaskLayer build(boolean z) {
            return new FeedMaskLayer(this, z);
        }
    }

    public FeedMaskLayer(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.topright_text;
            if (str == null) {
                this.topright_text = "";
            } else {
                this.topright_text = str;
            }
            List<MaskLayerText> list = builder.button_texts;
            if (list == null) {
                this.button_texts = DEFAULT_BUTTON_TEXTS;
                return;
            } else {
                this.button_texts = Message.immutableCopyOf(list);
                return;
            }
        }
        this.topright_text = builder.topright_text;
        this.button_texts = Message.immutableCopyOf(builder.button_texts);
    }
}
