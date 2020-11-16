package tbclient.ExcZan;

import com.squareup.wire.Message;
/* loaded from: classes22.dex */
public final class DataRes extends Message {
    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
        }
    }

    /* loaded from: classes22.dex */
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
}
