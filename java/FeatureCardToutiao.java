package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes10.dex */
public final class FeatureCardToutiao extends Message {
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer floor;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ThreadInfo> sub_nodes;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer type;
    public static final List<ThreadInfo> DEFAULT_SUB_NODES = Collections.emptyList();
    public static final Integer DEFAULT_TYPE = 0;
    public static final Integer DEFAULT_FLOOR = 0;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<FeatureCardToutiao> {
        public Integer floor;
        public List<ThreadInfo> sub_nodes;
        public String title;
        public Integer type;

        public Builder() {
        }

        public Builder(FeatureCardToutiao featureCardToutiao) {
            super(featureCardToutiao);
            if (featureCardToutiao == null) {
                return;
            }
            this.sub_nodes = Message.copyOf(featureCardToutiao.sub_nodes);
            this.type = featureCardToutiao.type;
            this.title = featureCardToutiao.title;
            this.floor = featureCardToutiao.floor;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FeatureCardToutiao build(boolean z) {
            return new FeatureCardToutiao(this, z);
        }
    }

    public FeatureCardToutiao(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<ThreadInfo> list = builder.sub_nodes;
            if (list == null) {
                this.sub_nodes = DEFAULT_SUB_NODES;
            } else {
                this.sub_nodes = Message.immutableCopyOf(list);
            }
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            Integer num2 = builder.floor;
            if (num2 == null) {
                this.floor = DEFAULT_FLOOR;
                return;
            } else {
                this.floor = num2;
                return;
            }
        }
        this.sub_nodes = Message.immutableCopyOf(builder.sub_nodes);
        this.type = builder.type;
        this.title = builder.title;
        this.floor = builder.floor;
    }
}
