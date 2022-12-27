package tbclient.GameForumGuideTab;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes9.dex */
public final class GameForumGuideTabResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<GameForumGuideTabResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GameForumGuideTabResIdl gameForumGuideTabResIdl) {
            super(gameForumGuideTabResIdl);
            if (gameForumGuideTabResIdl == null) {
                return;
            }
            this.error = gameForumGuideTabResIdl.error;
            this.data = gameForumGuideTabResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GameForumGuideTabResIdl build(boolean z) {
            return new GameForumGuideTabResIdl(this, z);
        }
    }

    public GameForumGuideTabResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }
}
