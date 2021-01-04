package tbclient.ZoneRight;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class DataRes extends Message {
    public static final Integer DEFAULT_HAS_RIGHT = 0;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer has_right;
    @ProtoField(tag = 2)
    public final Toast toast;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.has_right == null) {
                this.has_right = DEFAULT_HAS_RIGHT;
            } else {
                this.has_right = builder.has_right;
            }
            this.toast = builder.toast;
            return;
        }
        this.has_right = builder.has_right;
        this.toast = builder.toast;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public Integer has_right;
        public Toast toast;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.has_right = dataRes.has_right;
                this.toast = dataRes.toast;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
