package tbclient.DelMyGame;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class ResData extends Message {
    public static final Integer DEFAULT_INIT = 0;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer init;

    /* synthetic */ ResData(Builder builder, boolean z, ResData resData) {
        this(builder, z);
    }

    private ResData(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.init == null) {
                this.init = DEFAULT_INIT;
                return;
            } else {
                this.init = builder.init;
                return;
            }
        }
        this.init = builder.init;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<ResData> {
        public Integer init;

        public Builder(ResData resData) {
            super(resData);
            if (resData != null) {
                this.init = resData.init;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ResData build(boolean z) {
            return new ResData(this, z, null);
        }
    }
}
