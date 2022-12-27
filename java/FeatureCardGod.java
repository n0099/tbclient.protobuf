package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class FeatureCardGod extends Message {
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer floor;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<User> sub_nodes;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer type;
    public static final List<User> DEFAULT_SUB_NODES = Collections.emptyList();
    public static final Integer DEFAULT_TYPE = 0;
    public static final Integer DEFAULT_FLOOR = 0;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<FeatureCardGod> {
        public Integer floor;
        public List<User> sub_nodes;
        public String title;
        public Integer type;

        public Builder() {
        }

        public Builder(FeatureCardGod featureCardGod) {
            super(featureCardGod);
            if (featureCardGod == null) {
                return;
            }
            this.sub_nodes = Message.copyOf(featureCardGod.sub_nodes);
            this.type = featureCardGod.type;
            this.floor = featureCardGod.floor;
            this.title = featureCardGod.title;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FeatureCardGod build(boolean z) {
            return new FeatureCardGod(this, z);
        }
    }

    public FeatureCardGod(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<User> list = builder.sub_nodes;
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
            Integer num2 = builder.floor;
            if (num2 == null) {
                this.floor = DEFAULT_FLOOR;
            } else {
                this.floor = num2;
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
        this.type = builder.type;
        this.floor = builder.floor;
        this.title = builder.title;
    }
}
