package tbclient.HomePage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class ModuleItem extends Message {
    public static final Long DEFAULT_MID = 0L;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long mid;

    /* synthetic */ ModuleItem(Builder builder, boolean z, ModuleItem moduleItem) {
        this(builder, z);
    }

    private ModuleItem(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.mid == null) {
                this.mid = DEFAULT_MID;
                return;
            } else {
                this.mid = builder.mid;
                return;
            }
        }
        this.mid = builder.mid;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<ModuleItem> {
        public Long mid;

        public Builder() {
        }

        public Builder(ModuleItem moduleItem) {
            super(moduleItem);
            if (moduleItem != null) {
                this.mid = moduleItem.mid;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ModuleItem build(boolean z) {
            return new ModuleItem(this, z, null);
        }
    }
}
