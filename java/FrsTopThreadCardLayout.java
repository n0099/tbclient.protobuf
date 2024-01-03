package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class FrsTopThreadCardLayout extends Message {
    public static final List<ComponentFactory> DEFAULT_COMPONENTS = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ComponentFactory> components;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<FrsTopThreadCardLayout> {
        public List<ComponentFactory> components;

        public Builder() {
        }

        public Builder(FrsTopThreadCardLayout frsTopThreadCardLayout) {
            super(frsTopThreadCardLayout);
            if (frsTopThreadCardLayout == null) {
                return;
            }
            this.components = Message.copyOf(frsTopThreadCardLayout.components);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FrsTopThreadCardLayout build(boolean z) {
            return new FrsTopThreadCardLayout(this, z);
        }
    }

    public FrsTopThreadCardLayout(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<ComponentFactory> list = builder.components;
            if (list == null) {
                this.components = DEFAULT_COMPONENTS;
                return;
            } else {
                this.components = Message.immutableCopyOf(list);
                return;
            }
        }
        this.components = Message.immutableCopyOf(builder.components);
    }
}
