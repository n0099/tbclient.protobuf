package tbclient.GameForumGuideTab;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes6.dex */
public final class GameForumGuideTabResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private GameForumGuideTabResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder<GameForumGuideTabResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GameForumGuideTabResIdl gameForumGuideTabResIdl) {
            super(gameForumGuideTabResIdl);
            if (gameForumGuideTabResIdl != null) {
                this.error = gameForumGuideTabResIdl.error;
                this.data = gameForumGuideTabResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GameForumGuideTabResIdl build(boolean z) {
            return new GameForumGuideTabResIdl(this, z);
        }
    }
}
