package tbclient.AddMyGameBatch;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class ResData extends Message {
    public static final String DEFAULT_GAME_ID = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String game_id;

    /* synthetic */ ResData(Builder builder, boolean z, ResData resData) {
        this(builder, z);
    }

    private ResData(Builder builder, boolean z) {
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
    public final class Builder extends Message.Builder<ResData> {
        public String game_id;

        public Builder(ResData resData) {
            super(resData);
            if (resData != null) {
                this.game_id = resData.game_id;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ResData build(boolean z) {
            return new ResData(this, z, null);
        }
    }
}
