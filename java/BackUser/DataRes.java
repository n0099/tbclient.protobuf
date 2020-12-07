package tbclient.BackUser;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes22.dex */
public final class DataRes extends Message {
    public static final Integer DEFAULT_IS_BACK_USER = 0;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer is_back_user;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.is_back_user == null) {
                this.is_back_user = DEFAULT_IS_BACK_USER;
                return;
            } else {
                this.is_back_user = builder.is_back_user;
                return;
            }
        }
        this.is_back_user = builder.is_back_user;
    }

    /* loaded from: classes22.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public Integer is_back_user;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.is_back_user = dataRes.is_back_user;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
