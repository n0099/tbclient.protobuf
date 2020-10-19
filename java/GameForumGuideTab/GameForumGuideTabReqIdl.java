package tbclient.GameForumGuideTab;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes22.dex */
public final class GameForumGuideTabReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private GameForumGuideTabReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes22.dex */
    public static final class Builder extends Message.Builder<GameForumGuideTabReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GameForumGuideTabReqIdl gameForumGuideTabReqIdl) {
            super(gameForumGuideTabReqIdl);
            if (gameForumGuideTabReqIdl != null) {
                this.data = gameForumGuideTabReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GameForumGuideTabReqIdl build(boolean z) {
            return new GameForumGuideTabReqIdl(this, z);
        }
    }
}
