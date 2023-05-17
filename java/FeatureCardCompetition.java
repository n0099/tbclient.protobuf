package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes10.dex */
public final class FeatureCardCompetition extends Message {
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer floor;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<FeatureCardCompetitionSubNode> sub_nodes;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer type;
    public static final List<FeatureCardCompetitionSubNode> DEFAULT_SUB_NODES = Collections.emptyList();
    public static final Integer DEFAULT_FLOOR = 0;
    public static final Integer DEFAULT_TYPE = 0;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<FeatureCardCompetition> {
        public Integer floor;
        public List<FeatureCardCompetitionSubNode> sub_nodes;
        public String title;
        public Integer type;

        public Builder() {
        }

        public Builder(FeatureCardCompetition featureCardCompetition) {
            super(featureCardCompetition);
            if (featureCardCompetition == null) {
                return;
            }
            this.sub_nodes = Message.copyOf(featureCardCompetition.sub_nodes);
            this.floor = featureCardCompetition.floor;
            this.type = featureCardCompetition.type;
            this.title = featureCardCompetition.title;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FeatureCardCompetition build(boolean z) {
            return new FeatureCardCompetition(this, z);
        }
    }

    public FeatureCardCompetition(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<FeatureCardCompetitionSubNode> list = builder.sub_nodes;
            if (list == null) {
                this.sub_nodes = DEFAULT_SUB_NODES;
            } else {
                this.sub_nodes = Message.immutableCopyOf(list);
            }
            Integer num = builder.floor;
            if (num == null) {
                this.floor = DEFAULT_FLOOR;
            } else {
                this.floor = num;
            }
            Integer num2 = builder.type;
            if (num2 == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num2;
            }
            String str = builder.title;
            if (str == null) {
                this.title = "";
                return;
            } else {
                this.title = str;
                return;
            }
        }
        this.sub_nodes = Message.immutableCopyOf(builder.sub_nodes);
        this.floor = builder.floor;
        this.type = builder.type;
        this.title = builder.title;
    }
}
