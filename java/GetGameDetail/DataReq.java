package tbclient.GetGameDetail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_GAME_ID = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String game_id;

    /* synthetic */ DataReq(Builder builder, boolean z, DataReq dataReq) {
        this(builder, z);
    }

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.game_id == null) {
                this.game_id = "";
                return;
            } else {
                this.game_id = builder.game_id;
                return;
            }
        }
        this.game_id = builder.game_id;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<DataReq> {
        public String game_id;

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.game_id = dataReq.game_id;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z, null);
        }
    }
}
