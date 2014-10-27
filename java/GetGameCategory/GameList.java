package tbclient.GetGameCategory;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class GameList extends Message {
    public static final String DEFAULT_NAME = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String name;

    /* synthetic */ GameList(Builder builder, boolean z, GameList gameList) {
        this(builder, z);
    }

    private GameList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.name == null) {
                this.name = "";
                return;
            } else {
                this.name = builder.name;
                return;
            }
        }
        this.name = builder.name;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<GameList> {
        public String name;

        public Builder(GameList gameList) {
            super(gameList);
            if (gameList != null) {
                this.name = gameList.name;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GameList build(boolean z) {
            return new GameList(this, z, null);
        }
    }
}
