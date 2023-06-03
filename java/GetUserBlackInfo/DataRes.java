package tbclient.GetUserBlackInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.PermissionList;
/* loaded from: classes2.dex */
public final class DataRes extends Message {
    public static final Integer DEFAULT_IS_BLACK_WHITE = 0;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer is_black_white;
    @ProtoField(tag = 2)
    public final PermissionList perm_list;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public Integer is_black_white;
        public PermissionList perm_list;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.is_black_white = dataRes.is_black_white;
            this.perm_list = dataRes.perm_list;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.is_black_white;
            if (num == null) {
                this.is_black_white = DEFAULT_IS_BLACK_WHITE;
            } else {
                this.is_black_white = num;
            }
            this.perm_list = builder.perm_list;
            return;
        }
        this.is_black_white = builder.is_black_white;
        this.perm_list = builder.perm_list;
    }
}
