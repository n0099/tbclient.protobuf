package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes21.dex */
public final class TiebaFieldsInfo extends Message {
    public static final String DEFAULT_TIEBA_NAME = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 1, type = Message.Datatype.STRING)
    public final List<String> tieba_fields;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String tieba_name;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<User> user_rank;
    public static final List<String> DEFAULT_TIEBA_FIELDS = Collections.emptyList();
    public static final List<User> DEFAULT_USER_RANK = Collections.emptyList();

    private TiebaFieldsInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.tieba_fields == null) {
                this.tieba_fields = DEFAULT_TIEBA_FIELDS;
            } else {
                this.tieba_fields = immutableCopyOf(builder.tieba_fields);
            }
            if (builder.tieba_name == null) {
                this.tieba_name = "";
            } else {
                this.tieba_name = builder.tieba_name;
            }
            if (builder.user_rank == null) {
                this.user_rank = DEFAULT_USER_RANK;
                return;
            } else {
                this.user_rank = immutableCopyOf(builder.user_rank);
                return;
            }
        }
        this.tieba_fields = immutableCopyOf(builder.tieba_fields);
        this.tieba_name = builder.tieba_name;
        this.user_rank = immutableCopyOf(builder.user_rank);
    }

    /* loaded from: classes21.dex */
    public static final class Builder extends Message.Builder<TiebaFieldsInfo> {
        public List<String> tieba_fields;
        public String tieba_name;
        public List<User> user_rank;

        public Builder() {
        }

        public Builder(TiebaFieldsInfo tiebaFieldsInfo) {
            super(tiebaFieldsInfo);
            if (tiebaFieldsInfo != null) {
                this.tieba_fields = TiebaFieldsInfo.copyOf(tiebaFieldsInfo.tieba_fields);
                this.tieba_name = tiebaFieldsInfo.tieba_name;
                this.user_rank = TiebaFieldsInfo.copyOf(tiebaFieldsInfo.user_rank);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TiebaFieldsInfo build(boolean z) {
            return new TiebaFieldsInfo(this, z);
        }
    }
}
