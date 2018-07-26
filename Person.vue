<template>
    <div>
        <XInput title="age" required="true" validator="validator:aMethod,bMethod"/>
        <XInput title="name" required="true" validator="validator:aMethod,bMethod"/>
        <XDataTime title="birthday"/>
        <XSelect title="others"/>
    </div>
</template>