package tbclient.GetMyGameList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.GameInfo;
/* loaded from: classes.dex */
public final class ResData extends Message {
    public static final List<GameInfo> DEFAULT_GAME_LIST = Collections.emptyList();
    public static final Integer DEFAULT_HAS_MORE = 0;
    public static final Integer DEFAULT_NEED_INIT = 0;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<GameInfo> game_list;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer has_more;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer need_init;

    /* synthetic */ ResData(Builder builder, boolean z, ResData resData) {
        this(builder, z);
    }

    private ResData(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.game_list == null) {
                this.game_list = DEFAULT_GAME_LIST;
            } else {
                this.game_list = immutableCopyOf(builder.game_list);
            }
            if (builder.has_more == null) {
                this.has_more = DEFAULT_HAS_MORE;
            } else {
                this.has_more = builder.has_more;
            }
            if (builder.need_init == null) {
                this.need_init = DEFAULT_NEED_INIT;
                return;
            } else {
                this.need_init = builder.need_init;
                return;
            }
        }
        this.game_list = immutableCopyOf(builder.game_list);
        this.has_more = builder.has_more;
        this.need_init = builder.need_init;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<ResData> {
        public List<GameInfo> game_list;
        public Integer has_more;
        public Integer need_init;

        public Builder(ResData resData) {
            super(resData);
            if (resData != null) {
                this.game_list = ResData.copyOf(resData.game_list);
                this.has_more = resData.has_more;
                this.need_init = resData.need_init;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ResData build(boolean z) {
            return new ResData(this, z, null);
        }
    }
}
