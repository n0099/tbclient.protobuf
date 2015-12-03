package tbclient.UserPk;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class DataRes extends Message {
    public static final Long DEFAULT_PK_ID = 0L;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long pk_id;

    /* synthetic */ DataRes(Builder builder, boolean z, DataRes dataRes) {
        this(builder, z);
    }

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.pk_id == null) {
                this.pk_id = DEFAULT_PK_ID;
                return;
            } else {
                this.pk_id = builder.pk_id;
                return;
            }
        }
        this.pk_id = builder.pk_id;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public Long pk_id;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.pk_id = dataRes.pk_id;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z, null);
        }
    }
}
