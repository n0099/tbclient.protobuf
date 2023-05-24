package tbclient.PetalRecord;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class PetalRecord extends Message {
    public static final String DEFAULT_FLOW_TYPE = "";
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long create_time;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String flow_type;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer petal_num;
    public static final Integer DEFAULT_PETAL_NUM = 0;
    public static final Long DEFAULT_CREATE_TIME = 0L;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<PetalRecord> {
        public Long create_time;
        public String flow_type;
        public Integer petal_num;

        public Builder() {
        }

        public Builder(PetalRecord petalRecord) {
            super(petalRecord);
            if (petalRecord == null) {
                return;
            }
            this.flow_type = petalRecord.flow_type;
            this.petal_num = petalRecord.petal_num;
            this.create_time = petalRecord.create_time;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PetalRecord build(boolean z) {
            return new PetalRecord(this, z);
        }
    }

    public PetalRecord(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.flow_type;
            if (str == null) {
                this.flow_type = "";
            } else {
                this.flow_type = str;
            }
            Integer num = builder.petal_num;
            if (num == null) {
                this.petal_num = DEFAULT_PETAL_NUM;
            } else {
                this.petal_num = num;
            }
            Long l = builder.create_time;
            if (l == null) {
                this.create_time = DEFAULT_CREATE_TIME;
                return;
            } else {
                this.create_time = l;
                return;
            }
        }
        this.flow_type = builder.flow_type;
        this.petal_num = builder.petal_num;
        this.create_time = builder.create_time;
    }
}
