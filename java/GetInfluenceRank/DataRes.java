package tbclient.GetInfluenceRank;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.RankRuler;
import tbclient.TiebaFieldsInfo;
import tbclient.User;
/* loaded from: classes7.dex */
public final class DataRes extends Message {
    @ProtoField(tag = 2)
    public final User current_user;
    @ProtoField(tag = 3)
    public final TiebaFieldsInfo field_info;
    @ProtoField(tag = 6, type = Message.Datatype.BOOL)
    public final Boolean has_more;
    @ProtoField(tag = 4)
    public final RankRuler rank_description;
    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long timestamp;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<User> user_rank;
    public static final List<User> DEFAULT_USER_RANK = Collections.emptyList();
    public static final Long DEFAULT_TIMESTAMP = 0L;
    public static final Boolean DEFAULT_HAS_MORE = Boolean.FALSE;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public User current_user;
        public TiebaFieldsInfo field_info;
        public Boolean has_more;
        public RankRuler rank_description;
        public Long timestamp;
        public List<User> user_rank;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.user_rank = Message.copyOf(dataRes.user_rank);
            this.current_user = dataRes.current_user;
            this.field_info = dataRes.field_info;
            this.rank_description = dataRes.rank_description;
            this.timestamp = dataRes.timestamp;
            this.has_more = dataRes.has_more;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<User> list = builder.user_rank;
            if (list == null) {
                this.user_rank = DEFAULT_USER_RANK;
            } else {
                this.user_rank = Message.immutableCopyOf(list);
            }
            this.current_user = builder.current_user;
            this.field_info = builder.field_info;
            this.rank_description = builder.rank_description;
            Long l = builder.timestamp;
            if (l == null) {
                this.timestamp = DEFAULT_TIMESTAMP;
            } else {
                this.timestamp = l;
            }
            Boolean bool = builder.has_more;
            if (bool == null) {
                this.has_more = DEFAULT_HAS_MORE;
                return;
            } else {
                this.has_more = bool;
                return;
            }
        }
        this.user_rank = Message.immutableCopyOf(builder.user_rank);
        this.current_user = builder.current_user;
        this.field_info = builder.field_info;
        this.rank_description = builder.rank_description;
        this.timestamp = builder.timestamp;
        this.has_more = builder.has_more;
    }
}
