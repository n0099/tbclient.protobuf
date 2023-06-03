package tbclient.Loop;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class IconRes extends Message {
    @ProtoField(tag = 1)
    public final IconPop pop;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<IconRes> {
        public IconPop pop;

        public Builder() {
        }

        public Builder(IconRes iconRes) {
            super(iconRes);
            if (iconRes == null) {
                return;
            }
            this.pop = iconRes.pop;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public IconRes build(boolean z) {
            return new IconRes(this, z);
        }
    }

    public IconRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.pop = builder.pop;
        } else {
            this.pop = builder.pop;
        }
    }
}
