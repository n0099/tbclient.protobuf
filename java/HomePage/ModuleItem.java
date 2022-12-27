package tbclient.HomePage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class ModuleItem extends Message {
    public static final Long DEFAULT_MID = 0L;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long mid;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ModuleItem> {
        public Long mid;

        public Builder() {
        }

        public Builder(ModuleItem moduleItem) {
            super(moduleItem);
            if (moduleItem == null) {
                return;
            }
            this.mid = moduleItem.mid;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ModuleItem build(boolean z) {
            return new ModuleItem(this, z);
        }
    }

    public ModuleItem(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.mid;
            if (l == null) {
                this.mid = DEFAULT_MID;
                return;
            } else {
                this.mid = l;
                return;
            }
        }
        this.mid = builder.mid;
    }
}
