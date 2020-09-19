import { Platform } from "../Home/Records/types";

export type Game = {
    id: number
    title: string;
    platform: Platform;
}

export type ChartItem ={
    x: string;
    y: number
}