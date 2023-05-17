package tbclient.ForumPersonas;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class MembersAge extends Message {
    public static final String DEFAULT_NAME = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 3, type = Message.Datatype.DOUBLE)
    public final Double rate;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer seq;
    public static final Integer DEFAULT_SEQ = 0;
    public static final Double DEFAULT_RATE = Double.valueOf(0.0d);

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<MembersAge> {
        public String name;
        public Double rate;
        public Integer seq;

        public Builder() {
        }

        public Builder(MembersAge membersAge) {
            super(membersAge);
            if (membersAge == null) {
                return;
            }
            this.seq = membersAge.seq;
            this.name = membersAge.name;
            this.rate = membersAge.rate;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public MembersAge build(boolean z) {
            return new MembersAge(this, z);
        }
    }

    public MembersAge(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.seq;
            if (num == null) {
                this.seq = DEFAULT_SEQ;
            } else {
                this.seq = num;
            }
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            Double d = builder.rate;
            if (d == null) {
                this.rate = DEFAULT_RATE;
                return;
            } else {
                this.rate = d;
                return;
            }
        }
        this.seq = builder.seq;
        this.name = builder.name;
        this.rate = builder.rate;
    }
}
