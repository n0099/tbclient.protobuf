package tbclient.GameForumRecomTab;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.FeatureCardHotSubNode;
/* loaded from: classes10.dex */
public final class FeatureCardHot extends Message {
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_TYPE = "";
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer floor;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<FeatureCardHotSubNode> sub_nodes;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String type;
    public static final List<FeatureCardHotSubNode> DEFAULT_SUB_NODES = Collections.emptyList();
    public static final Integer DEFAULT_FLOOR = 0;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<FeatureCardHot> {
        public Integer floor;
        public List<FeatureCardHotSubNode> sub_nodes;
        public String title;
        public String type;

        public Builder() {
        }

        public Builder(FeatureCardHot featureCardHot) {
            super(featureCardHot);
            if (featureCardHot == null) {
                return;
            }
            this.sub_nodes = Message.copyOf(featureCardHot.sub_nodes);
            this.type = featureCardHot.type;
            this.title = featureCardHot.title;
            this.floor = featureCardHot.floor;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FeatureCardHot build(boolean z) {
            return new FeatureCardHot(this, z);
        }
    }

    public FeatureCardHot(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<FeatureCardHotSubNode> list = builder.sub_nodes;
            if (list == null) {
                this.sub_nodes = DEFAULT_SUB_NODES;
            } else {
                this.sub_nodes = Message.immutableCopyOf(list);
            }
            String str = builder.type;
            if (str == null) {
                this.type = "";
            } else {
                this.type = str;
            }
            String str2 = builder.title;
            if (str2 == null) {
                this.title = "";
            } else {
                this.title = str2;
            }
            Integer num = builder.floor;
            if (num == null) {
                this.floor = DEFAULT_FLOOR;
                return;
            } else {
                this.floor = num;
                return;
            }
        }
        this.sub_nodes = Message.immutableCopyOf(builder.sub_nodes);
        this.type = builder.type;
        this.title = builder.title;
        this.floor = builder.floor;
    }
}
