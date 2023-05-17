package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes10.dex */
public final class AbstractComponent extends Message {
    public static final List<FeedContentResource> DEFAULT_DATA = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<FeedContentResource> data;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<AbstractComponent> {
        public List<FeedContentResource> data;

        public Builder() {
        }

        public Builder(AbstractComponent abstractComponent) {
            super(abstractComponent);
            if (abstractComponent == null) {
                return;
            }
            this.data = Message.copyOf(abstractComponent.data);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AbstractComponent build(boolean z) {
            return new AbstractComponent(this, z);
        }
    }

    public AbstractComponent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<FeedContentResource> list = builder.data;
            if (list == null) {
                this.data = DEFAULT_DATA;
                return;
            } else {
                this.data = Message.immutableCopyOf(list);
                return;
            }
        }
        this.data = Message.immutableCopyOf(builder.data);
    }
}
