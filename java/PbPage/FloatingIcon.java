package tbclient.PbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class FloatingIcon extends Message {
    @ProtoField(tag = 1)
    public final FloatingIconItem pbpage;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<FloatingIcon> {
        public FloatingIconItem pbpage;

        public Builder() {
        }

        public Builder(FloatingIcon floatingIcon) {
            super(floatingIcon);
            if (floatingIcon == null) {
                return;
            }
            this.pbpage = floatingIcon.pbpage;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FloatingIcon build(boolean z) {
            return new FloatingIcon(this, z);
        }
    }

    public FloatingIcon(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.pbpage = builder.pbpage;
        } else {
            this.pbpage = builder.pbpage;
        }
    }
}
