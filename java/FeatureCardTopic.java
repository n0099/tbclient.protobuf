package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class FeatureCardTopic extends Message {
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer floor;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<FeatureCardTopicSubNode> sub_nodes;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer type;
    public static final Integer DEFAULT_TYPE = 0;
    public static final Integer DEFAULT_FLOOR = 0;
    public static final List<FeatureCardTopicSubNode> DEFAULT_SUB_NODES = Collections.emptyList();

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<FeatureCardTopic> {
        public Integer floor;
        public List<FeatureCardTopicSubNode> sub_nodes;
        public String title;
        public Integer type;

        public Builder() {
        }

        public Builder(FeatureCardTopic featureCardTopic) {
            super(featureCardTopic);
            if (featureCardTopic == null) {
                return;
            }
            this.type = featureCardTopic.type;
            this.floor = featureCardTopic.floor;
            this.title = featureCardTopic.title;
            this.sub_nodes = Message.copyOf(featureCardTopic.sub_nodes);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FeatureCardTopic build(boolean z) {
            return new FeatureCardTopic(this, z);
        }
    }

    public FeatureCardTopic(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            Integer num2 = builder.floor;
            if (num2 == null) {
                this.floor = DEFAULT_FLOOR;
            } else {
                this.floor = num2;
            }
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            List<FeatureCardTopicSubNode> list = builder.sub_nodes;
            if (list == null) {
                this.sub_nodes = DEFAULT_SUB_NODES;
                return;
            } else {
                this.sub_nodes = Message.immutableCopyOf(list);
                return;
            }
        }
        this.type = builder.type;
        this.floor = builder.floor;
        this.title = builder.title;
        this.sub_nodes = Message.immutableCopyOf(builder.sub_nodes);
    }
}
