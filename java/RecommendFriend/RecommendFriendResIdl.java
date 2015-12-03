package tbclient.RecommendFriend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes.dex */
public final class RecommendFriendResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* synthetic */ RecommendFriendResIdl(Builder builder, boolean z, RecommendFriendResIdl recommendFriendResIdl) {
        this(builder, z);
    }

    private RecommendFriendResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<RecommendFriendResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(RecommendFriendResIdl recommendFriendResIdl) {
            super(recommendFriendResIdl);
            if (recommendFriendResIdl != null) {
                this.error = recommendFriendResIdl.error;
                this.data = recommendFriendResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RecommendFriendResIdl build(boolean z) {
            return new RecommendFriendResIdl(this, z, null);
        }
    }
}
