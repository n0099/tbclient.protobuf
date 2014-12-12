package tbclient.GetGameDetailNew;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.GameInfo;
/* loaded from: classes.dex */
public final class RelateGame extends Message {
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<GameInfo> game_list;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer relate_type;
    public static final Integer DEFAULT_RELATE_TYPE = 0;
    public static final List<GameInfo> DEFAULT_GAME_LIST = Collections.emptyList();

    /* synthetic */ RelateGame(Builder builder, boolean z, RelateGame relateGame) {
        this(builder, z);
    }

    private RelateGame(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.relate_type == null) {
                this.relate_type = DEFAULT_RELATE_TYPE;
            } else {
                this.relate_type = builder.relate_type;
            }
            if (builder.game_list == null) {
                this.game_list = DEFAULT_GAME_LIST;
                return;
            } else {
                this.game_list = immutableCopyOf(builder.game_list);
                return;
            }
        }
        this.relate_type = builder.relate_type;
        this.game_list = immutableCopyOf(builder.game_list);
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<RelateGame> {
        public List<GameInfo> game_list;
        public Integer relate_type;

        public Builder(RelateGame relateGame) {
            super(relateGame);
            if (relateGame != null) {
                this.relate_type = relateGame.relate_type;
                this.game_list = RelateGame.copyOf(relateGame.game_list);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RelateGame build(boolean z) {
            return new RelateGame(this, z, null);
        }
    }
}
