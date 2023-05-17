package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class TabPic extends Message {
    @ProtoField(tag = 2)
    public final TabPicDesc dark;
    @ProtoField(tag = 1)
    public final TabPicDesc normal;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<TabPic> {
        public TabPicDesc dark;
        public TabPicDesc normal;

        public Builder() {
        }

        public Builder(TabPic tabPic) {
            super(tabPic);
            if (tabPic == null) {
                return;
            }
            this.normal = tabPic.normal;
            this.dark = tabPic.dark;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TabPic build(boolean z) {
            return new TabPic(this, z);
        }
    }

    public TabPic(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.normal = builder.normal;
            this.dark = builder.dark;
            return;
        }
        this.normal = builder.normal;
        this.dark = builder.dark;
    }
}
