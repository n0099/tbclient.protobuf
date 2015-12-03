package tbclient.GetForumClassList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes.dex */
public final class GetForumClassListResIdl extends Message {
    @ProtoField(tag = 1)
    public final DataRes data;
    @ProtoField(tag = 2)
    public final Error error;

    /* synthetic */ GetForumClassListResIdl(Builder builder, boolean z, GetForumClassListResIdl getForumClassListResIdl) {
        this(builder, z);
    }

    private GetForumClassListResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
            this.error = builder.error;
            return;
        }
        this.data = builder.data;
        this.error = builder.error;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<GetForumClassListResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetForumClassListResIdl getForumClassListResIdl) {
            super(getForumClassListResIdl);
            if (getForumClassListResIdl != null) {
                this.data = getForumClassListResIdl.data;
                this.error = getForumClassListResIdl.error;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetForumClassListResIdl build(boolean z) {
            return new GetForumClassListResIdl(this, z, null);
        }
    }
}
