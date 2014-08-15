package tbclient.GetGameCenter;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.GameInfo;
/* loaded from: classes.dex */
public final class GameList extends Message {
    public static final List<GameInfo> DEFAULT_GAME_INFO = Collections.emptyList();
    public static final Integer DEFAULT_HAS_MORE = 0;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<GameInfo> game_info;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer has_more;

    /* synthetic */ GameList(Builder builder, boolean z, GameList gameList) {
        this(builder, z);
    }

    private GameList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.game_info == null) {
                this.game_info = DEFAULT_GAME_INFO;
            } else {
                this.game_info = immutableCopyOf(builder.game_info);
            }
            if (builder.has_more == null) {
                this.has_more = DEFAULT_HAS_MORE;
                return;
            } else {
                this.has_more = builder.has_more;
                return;
            }
        }
        this.game_info = immutableCopyOf(builder.game_info);
        this.has_more = builder.has_more;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<GameList> {
        public List<GameInfo> game_info;
        public Integer has_more;

        public Builder(GameList gameList) {
            super(gameList);
            if (gameList != null) {
                this.game_info = GameList.copyOf(gameList.game_info);
                this.has_more = gameList.has_more;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GameList build(boolean z) {
            return new GameList(this, z, null);
        }
    }
}
