package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class TbInteraction extends Message {
    public static final String DEFAULT_CONTENT = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String content;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<TbInteraction> {
        public String content;

        public Builder() {
        }

        public Builder(TbInteraction tbInteraction) {
            super(tbInteraction);
            if (tbInteraction == null) {
                return;
            }
            this.content = tbInteraction.content;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TbInteraction build(boolean z) {
            return new TbInteraction(this, z);
        }
    }

    public TbInteraction(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.content;
            if (str == null) {
                this.content = "";
                return;
            } else {
                this.content = str;
                return;
            }
        }
        this.content = builder.content;
    }
}
