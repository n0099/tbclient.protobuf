package tbclient.UserMuteCheck;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class DataRes extends Message {
    public static final String DEFAULT_IS_MUTE = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String is_mute;

    /* synthetic */ DataRes(Builder builder, boolean z, DataRes dataRes) {
        this(builder, z);
    }

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.is_mute == null) {
                this.is_mute = "";
                return;
            } else {
                this.is_mute = builder.is_mute;
                return;
            }
        }
        this.is_mute = builder.is_mute;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public String is_mute;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.is_mute = dataRes.is_mute;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z, null);
        }
    }
}
