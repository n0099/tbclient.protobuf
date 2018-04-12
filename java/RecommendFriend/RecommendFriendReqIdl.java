package tbclient.RecommendFriend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes3.dex */
public final class RecommendFriendReqIdl extends Message {
    @ProtoField(tag = 1)
    public final ReqData data;

    private RecommendFriendReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<RecommendFriendReqIdl> {
        public ReqData data;

        public Builder() {
        }

        public Builder(RecommendFriendReqIdl recommendFriendReqIdl) {
            super(recommendFriendReqIdl);
            if (recommendFriendReqIdl != null) {
                this.data = recommendFriendReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RecommendFriendReqIdl build(boolean z) {
            return new RecommendFriendReqIdl(this, z);
        }
    }
}