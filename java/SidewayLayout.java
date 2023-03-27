package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class SidewayLayout extends Message {
    @ProtoField(label = Message.Label.REPEATED, tag = 5)
    public final List<FeedKV> business_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ComponentFactory> components;
    @ProtoField(tag = 4)
    public final FeedFeedback feedback;
    @ProtoField(tag = 3)
    public final ComponentFactory title;
    public static final List<ComponentFactory> DEFAULT_COMPONENTS = Collections.emptyList();
    public static final List<FeedKV> DEFAULT_BUSINESS_INFO = Collections.emptyList();

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<SidewayLayout> {
        public List<FeedKV> business_info;
        public List<ComponentFactory> components;
        public FeedFeedback feedback;
        public ComponentFactory title;

        public Builder() {
        }

        public Builder(SidewayLayout sidewayLayout) {
            super(sidewayLayout);
            if (sidewayLayout == null) {
                return;
            }
            this.components = Message.copyOf(sidewayLayout.components);
            this.title = sidewayLayout.title;
            this.feedback = sidewayLayout.feedback;
            this.business_info = Message.copyOf(sidewayLayout.business_info);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SidewayLayout build(boolean z) {
            return new SidewayLayout(this, z);
        }
    }

    public SidewayLayout(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<ComponentFactory> list = builder.components;
            if (list == null) {
                this.components = DEFAULT_COMPONENTS;
            } else {
                this.components = Message.immutableCopyOf(list);
            }
            this.title = builder.title;
            this.feedback = builder.feedback;
            List<FeedKV> list2 = builder.business_info;
            if (list2 == null) {
                this.business_info = DEFAULT_BUSINESS_INFO;
                return;
            } else {
                this.business_info = Message.immutableCopyOf(list2);
                return;
            }
        }
        this.components = Message.immutableCopyOf(builder.components);
        this.title = builder.title;
        this.feedback = builder.feedback;
        this.business_info = Message.immutableCopyOf(builder.business_info);
    }
}
