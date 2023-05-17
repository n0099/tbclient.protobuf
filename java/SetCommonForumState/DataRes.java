package tbclient.SetCommonForumState;

import com.squareup.wire.Message;
/* loaded from: classes2.dex */
public final class DataRes extends Message {

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
    }
}
